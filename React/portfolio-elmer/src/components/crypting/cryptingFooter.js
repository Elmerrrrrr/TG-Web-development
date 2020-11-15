import React from "react";
// import ReactDOM from "react-dom";
import { useDencrypt } from "use-dencrypt-effect";

import "./_crypting.scss";

const values = ["Elmer Volgers", "©2020 - Elmer Volgers"];


const DencryptFooter = () => {
  const { result, dencrypt} = useDencrypt();

  React.useEffect(() => {
    let i = 0;

    const action = setInterval(() => {
      dencrypt(values[i]);

      i = i === values.length - 1 ? 0 : i + 1;
    }, 4000);

    return () => clearInterval(action);
  }, []);

  return <h3>{result}</h3>;
};

export default DencryptFooter;

