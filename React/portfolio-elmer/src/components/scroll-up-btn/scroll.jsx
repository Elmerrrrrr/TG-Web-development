import './_scroll.scss';
import { BiArrowToTop } from 'react-icons/bi';

import {Helmet} from "react-helmet";


function ScrollUpBtn(){


    function onPressButton() {
        window.scrollTo(0, 0);
      }
       
        return (
           
            <>
            <BiArrowToTop  className='btn-icon' onClick={onPressButton}/>

            <Helmet>
            <script src="../scroll.js"></script>
            </Helmet>
            </>


        );
    }

export default ScrollUpBtn;
