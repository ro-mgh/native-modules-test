import * as React from 'react';
import { StyleSheet, View, Button, Text } from 'react-native';
import { changeText } from 'react-native-rm-text-module';

export default function App() {
  const [value, setValue] = React.useState<string | undefined>('Old Text');

  const handleButtonPress = () => {
    changeText('new text', (newText: string) => {
      console.log('Hey from native side!!');
      setValue(newText);
    });
  };

  return (
    <View style={styles.container}>
      <Text>{value}</Text>
      <Button title="Press Me" onPress={handleButtonPress} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
