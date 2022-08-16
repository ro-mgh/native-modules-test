# react-native-rm-text-module

basic text module

## Installation

```sh
npm install react-native-rm-text-module
```

## Usage

```js
import { changeText } from 'react-native-rm-text-module';

// ...

const handleButtonPress = () => {
  changeText('new text', (newText: string) => {
    console.log('Hey from native side!!');
    setValue(newText);
  });
};
```

## License

MIT

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)
