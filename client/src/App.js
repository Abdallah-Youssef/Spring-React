import './App.css';
import InfiniteScroller from './components/InfiniteScroller';
import { Route, Switch } from 'react-router-dom';
import { Welcome } from './components/Welcome';
function App() {
  return (<h1> Hello world</h1>)
  return (
    <div className="App">
      <Switch>
        <Route exact path="/" component={Welcome}/>
        <Route path="/list" component={InfiniteScroller}/>
      </Switch>
    </div>
  );
}

export default App;
