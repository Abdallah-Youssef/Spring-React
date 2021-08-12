import React, { useState, useEffect } from 'react'
import debounce from 'lodash.debounce';



const InfiniteScroller = () => {
    const [words, setWords] = useState([]);
    const [isFetching, setIsFetching] = useState(false);


    useEffect(() => {
        window.addEventListener('scroll', debounce(handleScroll, 500));

        // Get initial data
        fetch("http://localhost:8080/list", { method: "GET" })
            .then(response => response.json())
            .then(list => {
                setWords(list)
            });

    }, [])

    useEffect(() => {
        if (isFetching){
            let newWords = [...words]
            fetch("http://localhost:8080/list", { method: "GET" })
            .then(response => response.json())
            .then(list => {
                setWords(newWords.concat(list))
                setIsFetching(false)
            })
        }

    }, [isFetching])


    const handleScroll = () => {
        if (window.innerHeight + Math.ceil(document.documentElement.scrollTop) < document.documentElement.offsetHeight) return;
        setIsFetching(true)
    }
    return (
        <div>
            {
                words.map((word, i) => (
                    <h1 key={i}>
                        {i} : {word}
                    </h1>))
            }

        </div>
    )
}

export default InfiniteScroller;