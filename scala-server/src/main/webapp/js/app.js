var DrawerList = React.createClass({
    render: function() {
        return (
            <div className="DrawerList">
            Hello, world! I am a DrawerList.
            </div>
        );
    }
});

var PromoterList = React.createClass({
    render: function() {
        return (
            <div className="PromoterList">
            Hello, world! I am a PromoterList.
            </div>
        );
    }    
});

var Shelf = React.createClass({
    render: function() {
        return (
          <div className="shelf">
            <h2 className="name">
              {this.props.name}
            </h2>
            <div className="col-md-6">
                <PromoterList />
            </div>
            <div className="col-md-6"><DrawerList /></div>
            {this.props.children.toString()}
          </div>
        );
    }
});

var ShelfList = React.createClass({
    render: function() {
        return (
            <div className="ShelfList">
            Hello, world! I am a ShelfList.
            </div>
        );
    }    
});

var Stack = React.createClass({
  render: function() {
    return (
      <div class="container">
        <Shelf name="bob">
            Hello World! Injected Stack Body Text
        </Shelf>
      </div>
    );
  }
});

ReactDOM.render(
  <Stack />,
  document.getElementById('content')
);