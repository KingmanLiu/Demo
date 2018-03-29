'use strict';

import React from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View
} from 'react-native';

class HelloWorld extends React.Component {

  constructor(props){
    super(props);
    // eventName为5.1中的eventName，reminder为5.1中的status
//    DeviceEventEmitter.addListener(eventName, (reminder) => {
//          console.log(reminder);
//          alert(123)
//        });
  }
  render() {
    return (
      <View style={styles.container}>
        <Text style={styles.hello}>the first react native test</Text>
      </View>
    )
  }


}
var styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
  },
  hello: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
});

AppRegistry.registerComponent('reactnativeapp', () => HelloWorld);