import Profile from './profile.js';
import ProgressComputer from './progress-computer-skills';
import ProgressProgramming from './progress-programming';
import './_about.scss';
import * as React from "react";
import { useRef } from "react";
import { motion } from "framer-motion";
// import Footer from './components/footer/footer';

function About(){
    const constraintsRef = useRef(null);
    return(


<motion.div className="aboutContainter" id="about" ref={constraintsRef}>


<motion.div drag dragConstraints={constraintsRef} ><Profile /></motion.div>  
<motion.div drag dragConstraints={constraintsRef} ><ProgressComputer /></motion.div>
<motion.div drag dragConstraints={constraintsRef} ><ProgressProgramming /></motion.div>  



</motion.div>



   );
}

export default About;