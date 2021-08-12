import React from 'react'

export const Welcome = ({history}) => {
    return (
        <div>
            Hello
            <button onClick={()=> history.push("/list")}>
                Go to the list
            </button>
        </div>
    )
}
