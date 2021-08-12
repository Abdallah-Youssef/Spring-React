import React, { useState, useEffect } from 'react'
import debounce from 'lodash.debounce';



const InfiniteScroller = () => {
    const [words, setWords] = useState([]);
    const [isFetching, setIsFetching] = useState(false);


    useEffect(() => {
        console.log("Hello???");
        window.addEventListener('scroll', handleScroll);

        // Get initial data
        fetch("http://localhost:8080/list", { method: "GET" })
            .then(response => response.json())
            .then(list => {
                setWords(list)
            });

    }, [])

    useEffect(() => {
        if (isFetching){
            const scrollTop = document.documentElement.scrollTop;
            let newWords = [...words]
            fetch("http://localhost:8080/list", { method: "GET" })
            .then(response => response.json())
            .then(list => {
                setWords(newWords.concat(list))
                window.scroll(0, scrollTop)
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

            {isFetching && <h1>Loading....</h1>}
        </div>
    )
}

export default InfiniteScroller;