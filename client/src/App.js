import "./App.css";
import InfiniteScroller from "./components/InfiniteScroller";
import { BrowserRouter, Route, Switch } from "react-router-dom";
import Welcome from "./components/Welcome";
function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Switch>
          <Route exact path="/" component={Welcome} />
          <Route path="/list" component={InfiniteScroller} />
        </Switch>
      </BrowserRouter>
    </div>
  );
}

export default App;
