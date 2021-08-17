import  { useState } from 'react'

const useFetch = (url) => {
    const [words, setWords] = useState([])
    const [loading, setLoading] = useState(true)

    const pushNewWords = () => {

        fetch(url, { method: "GET" })
        .then(response => response.json())
        .then(list => {
            if (list.length === 0)
                setLoading(false)
            else {
                // console.log(words);
                // console.log(list);
                setWords(words.concat(list))
            }
            
        })
    }

    return { words, loading,  pushNewWords };
};

export default useFetch;