import Container from 'react-bootstrap/Container';
import {Helmet} from "react-helmet";
// import Row from 'react-bootstrap/Row';
// import Col from 'react-bootstrap/Col';
// import Jumbotron from 'react-bootstrap/Jumbotron';

import './_banner.scss';
// import Background from '../../assets/img/portfolio/elmer-portfolio-banner-1030x500v1.1.jpg'

function Banner() {
    return(


    <Container fluid className ='banner' >
        <h1>Elmer Volgers</h1>
        <h2>WebDeveloper</h2> 
        

        <canvas id="c">

        </canvas>
     
       
     <Helmet>
             <script src="../background.js"></script>
     </Helmet>

       
    </Container>
             
      
      );
}

export default Banner;

