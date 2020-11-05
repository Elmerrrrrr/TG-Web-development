import './_banner.scss';
import Container from 'react-bootstrap/Container';
import {Helmet} from "react-helmet";
import DencryptBanner from '../crypting/cryptingBanner';
import DencryptBannerTitle from '../crypting/cryptingBannerTitle';


// import Background from '../../assets/img/portfolio/elmer-portfolio-banner-1030x500v1.1.jpg'

function Banner() {
    return(


    <Container fluid className ='banner' >

      <div className ='titleBanner'>
        <DencryptBannerTitle />
        <DencryptBanner />
      </div>


        <canvas id="c">

        </canvas>
     
       
     <Helmet>
             <script src="../background.js"></script>
     </Helmet>

       
    </Container>
             
      
      );
}

export default Banner;

