import React, { useState, useEffect } from 'react'
import debounce from 'lodash.debounce';
import useFetch from '../hooks/useFetch';



const InfiniteScroller = () => {
    const {words, pushNewWords} = useFetch("http://localhost:8080/list");
    const [isFetching, setIsFetching] = useState(false);


    useEffect(() => {
        window.addEventListener('scroll', debounce(handleScroll, 500));
        pushNewWords()
    }, [])

    useEffect(() => {
        if (isFetching){
            setIsFetching(false)
            pushNewWords()
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