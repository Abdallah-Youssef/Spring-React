import  { useState } from 'react'

const useFetch = (url) => {
    const [words, setWords] = useState([])

    const pushNewWords = () => {

        fetch(url, { method: "GET" })
        .then(response => response.json())
        .then(list => {
            console.log(words);
            console.log(list);
            setWords(words.concat(list))
        })
    }

    return { words, pushNewWords };
};

export default useFetch;