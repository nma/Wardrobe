const loadStacks = (state = 0, action) => {
  console.log('reducer');
  console.log(action);
  return state;
}

const store = Redux.createStore(loadStacks);

const Stack = ({
  value
}) => (
  <div >
    <h1>{value}</h1>
  </div>
);

const render = () => {
  ReactDOM.render(
    <Stack value={store.getState()} />,
    document.getElementById('content')
  );
}

store.subscribe(render);
render();