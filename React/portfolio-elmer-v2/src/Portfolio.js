import './_Portfolio.scss';
import Navigation from './components/navigation/navigation';
import Banner from './components/banner/banner';
import About from './components/about/about';
import ContactForm from './components/contact/contact';
import Footer from './components/footer/footer';

import * as React from "react";
import { useState } from "react";
import { Refresh } from "./Refresh";
import { useRef } from "react";
import { motion } from "framer-motion"


function Portfolio() {
  const constraintsRef = useRef(null);
  const [count, setCount] = useState(0);
  
  return (
    <>

      <Navigation />
      <Banner />
     
      

      <Refresh onClick={() => setCount(count + 1)} />

      <motion.div className="mainContainer" ref={constraintsRef}>
      

        <About key={count} />
        
        
        <motion.div drag dragConstraints={constraintsRef} ><ContactForm /></motion.div>  


      </motion.div>

      <Footer />
                   
     
    
</>
  );
}

export default Portfolio;
