import {Selector, ClientFunction} from 'testcafe'
fixture('testcafe demo').page('http://localhost:3000/list')

const getScrollTop = ClientFunction(() => window.scrollY);

test('Loads new words after scrolling', async t => {
    await t
    .scroll(0,200)
    .wait(3000)
    
    const words = await Selector("ul").childElementCount
    //console.log(words);
    await t.expect(words).eql(40)

})

test('Shows "No more Data" after scrolling', async t => {

    for (let i = 0;i < 7;i++){
        const ul = await Selector("ul")
        const itemCount = await ul.childElementCount
        //console.log(itemCount);
        
        //console.log("-------------------------");
        const listItems = await Selector("li")
        const lastLi = await listItems.nth(itemCount-1); 
        //console.log(await listItems.nth(itemCount-1).innerText);
        await t.scrollIntoView(lastLi).wait(1000)


        // // listItems.n
        // const lastLi = listItems[listItems.length-1]
    }
    
    const done = await Selector("h1").textContent
    //console.log(words);
    await t.expect(done).eql(" No more Data ")

})