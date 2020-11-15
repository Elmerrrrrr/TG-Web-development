import React from "react";
// import ReactDOM from "react-dom";
import { useDencrypt } from "use-dencrypt-effect";

import "./_crypting.scss";

const values = ["Elmer Volgers", "Elmer Volgers"];


const DencryptBannerTitle = () => {
  const { result, dencrypt} = useDencrypt();

  React.useEffect(() => {
    let i = 0;

    const action = setInterval(() => {
      dencrypt(values[i]);

      i = i === values.length - 1 ? 0 : i + 1;
    }, 5000);

    return () => clearInterval(action);
  }, []);

  return <h1>{result}</h1>;
};

export default DencryptBannerTitle;

