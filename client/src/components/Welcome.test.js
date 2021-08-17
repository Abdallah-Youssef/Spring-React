import React from 'react'
import Welcome from './Welcome'
import App from '../App'
import { render, screen } from '@testing-library/react'
import userEvent from '@testing-library/user-event'

test('Welcome page has h1', async () => {
    render(<Welcome/>)

    let v = await screen.findAllByText('Hello')
    expect(v.length).toEqual(1)
    expect(v[0].tagName).toEqual('H1')
})


test('Has a button', () => {
    render(<Welcome/>)
    let buttons = screen.getAllByRole('button')
    expect(buttons.length).toEqual(1)
    expect(buttons[0].textContent).toEqual('Go to the list')
})

test('The button redirects', () => {
    render(<App/>)
    let buttons = screen.getAllByRole('button')
    let button = buttons[0]
    userEvent.click(button)
    expect(global.window.location.pathname).toEqual('/list');

    
})