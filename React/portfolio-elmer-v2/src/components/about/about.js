import Profile from './profile.js';
import Progress from './progress.js';
import './_about.scss';
import * as React from "react";
import { useRef } from "react";
import { motion } from "framer-motion";


function About(){
    const constraintsRef = useRef(null);
    return(


<motion.div className="aboutContainter" id="about" ref={constraintsRef}>


<motion.div drag dragConstraints={constraintsRef} ><Profile /></motion.div>  
<motion.div drag dragConstraints={constraintsRef} ><Progress /></motion.div>  

</motion.div>

   );
}

export default About;