import './_parallax.scss';

import React from "react";
import {Helmet} from "react-helmet";


function Parallax(){

    return(

  
    <div className='parallax'>

        <canvas id="c"></canvas>
     
        

       
        <Helmet>
                <script src="../background.js"></script>
        </Helmet>



    </div>

      
    );
}

export default Parallax;