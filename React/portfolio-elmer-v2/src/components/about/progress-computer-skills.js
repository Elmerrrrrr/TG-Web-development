import ProgressBar from 'react-bootstrap/ProgressBar';
import { BsArrowsMove } from 'react-icons/bs';
import './_about.scss';



function ProgressComputer(){

    return(

    <div className ='progress-programming' >
        <p  className ='arrow-move'><BsArrowsMove/></p>  
        <h3>Computer Skills</h3>
        <br/>
        <h4>Office packages</h4>
        <ProgressBar variant="warning" now={90} />
        <h4>Photoshop / Illustrator</h4>
        <ProgressBar variant="warning" now={75} />
        <h4>Hardware</h4> 
        <ProgressBar variant="warning" now={55} />
        <h4>Git</h4>
        <ProgressBar variant="warning" now={40} />
        <h4>Linux</h4>
        <ProgressBar variant="warning" now={35} />
    </div>     
   
  
   );
}

export default ProgressComputer;