import React from 'react'
import { render, screen } from '@testing-library/react'
import InfiniteScroller from './InfiniteScroller'

test('Initially loads 20 words', async () => {
    render(<InfiniteScroller/>)

    let v = await screen.findAllByRole('heading')
    // v.forEach(n => console.log(n.innerHTML))
    expect(v.length).toEqual(20)
})



/**
 * Cannot test load with jsdom because it doens's support layout
 * https://github.com/jsdom/jsdom#unimplemented-parts-of-the-web-platform
 * 
 * I used the properties like offsetTop to detect the end of the page
 * These properties are not supported by jsdom
 * I have to use a tool like cypress, so this test will take a little bit more tieme
 */

// test('Loads 20 more when scrolling to the end', async () => {
//     render(<InfiniteScroller/>)
//     let list = screen.getByRole('list')
//     list.addEventListener('scroll', () => { console.log("I got scrolled")});
//     fireEvent.scroll(window, { target: { scrollY: 1000 } });


//     setTimeout(async () => {
//         let v = await screen.findAllByRole('heading')
//         // v.forEach(n => console.log(n.innerHTML))
//         console.log(v.length);
//         expect(v.length).toEqual(20)
//     }, 5000)

// })