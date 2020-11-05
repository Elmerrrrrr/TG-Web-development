import './_navigation.scss'
import Navbar from "reactjs-navbar";
import { Refresh } from "../../Refresh";
import {
  faPaperPlane,
  faUser,
  faLink,
  

} from "@fortawesome/free-solid-svg-icons";

import React from 'react'



function Navigation() {
    // const [count, setCount] = useState(0);
    return (

      

      <Navbar
      //  logo={logo}
       // loader={<Loader type="Puff" color="#D85B5B" height={25} width={25} />}
        // isLoading={this.state.isLoading}
        // helpCallback={() => {
        //   alert("I need help... and coffee...");
        // }}
        menuItems={[
          {
            title: "Home",
            icon: faUser,
            isAuth: true,
            onClick: () => {
              window.location = "#";   
            },
          },
          {
            title: "About me",
            icon: faUser,
            isAuth: true,
            onClick: () => {
              window.location = "#about";   
            },
          },
          {
            title: "Contact",
            icon: faPaperPlane,
            isAuth: true,
            onClick: () => {
              window.location = "#contact";
            },
          },
        
          {
            title: null,
            icon: faLink,
            isAuth: true,
            onClick: () => {
              <Refresh />
             
              return true;
            },
          }
        ]}
     />
    );
  }
  
  export default Navigation;

