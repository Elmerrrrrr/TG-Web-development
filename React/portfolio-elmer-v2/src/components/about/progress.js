import ProgressBar from 'react-bootstrap/ProgressBar';
import { BsArrowsMove } from 'react-icons/bs';
import './_about.scss';



function Progress(){

    return(

    <div className ='progress-programming' >
        <p  className ='arrow-move'><BsArrowsMove/></p>  
        <h3>Skills</h3>
        <br/>
        <h4>HTML</h4>
        <ProgressBar variant="success" now={85} />
        <h4>CSS</h4>
        <ProgressBar variant="info" now={80} />
        <h4>JavaScript</h4> 
        <ProgressBar variant="warning" now={40} />
        <h4>React</h4>
        <ProgressBar variant="danger" now={30} />
        <h4>Wordpress</h4>
        <ProgressBar variant="info" now={80} />
    </div>     
   
  
   );
}

export default Progress;