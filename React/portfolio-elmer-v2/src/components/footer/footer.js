import './_footer.scss';

function Footer(){

    return(

        <div className='footer'>
            &copy; {1900 + new Date().getYear()} - Elmer Volgers

        </div>

    );
}

export default Footer;