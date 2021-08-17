import React from 'react'
import './Welcome.css'
const Welcome = ({history}) => {
    return (
        <div className="welcome">
            <h1>
            Hello
            </h1>
            <button onClick={()=> history.push("/list")}>
                <h1>
                Go to the list
                </h1>
            </button>
        </div>
    )
}
export default Welcome