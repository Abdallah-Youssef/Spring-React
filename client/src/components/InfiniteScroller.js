import React, { useState, useEffect } from 'react'
import CircularProgress from '@material-ui/core/CircularProgress';
import debounce from 'lodash.debounce';
import useFetch from '../hooks/useFetch';
import './InfiniteScroller.css'


const InfiniteScroller = () => {
    const {words, loading, pushNewWords} = useFetch("http://localhost:8080/list");
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

        {loading ? <CircularProgress /> : <h1 className="no-more-data"> No more Data </h1>}
        
        </div>
    )
}

export default InfiniteScroller;