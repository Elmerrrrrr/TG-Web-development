import {Nav, Navbar} from 'react-bootstrap';
import { BiFingerprint } from 'react-icons/bi';
import { IoIosPerson } from 'react-icons/io';
import { GiPaperPlane } from 'react-icons/gi';
import { FaLinkedin} from 'react-icons/fa';

import './_navigation.scss';

function Navigation() {

    return(

        <>
    <Navbar sticky="top" variant="dark">
    <Navbar.Brand href="https://github.com/Elmerrrrrr/TG-Web-development" target="_blank"><BiFingerprint/></Navbar.Brand>
    <Nav className="mr-auto">
      <Nav.Link href="#about" ><IoIosPerson /> About Me</Nav.Link>
      <Nav.Link href="#contact"><GiPaperPlane /> Contact</Nav.Link>
      <Nav.Link href="https://www.linkedin.com/in/elmer-volgers-67729614a/" target="_blank"><FaLinkedin/></Nav.Link>
    </Nav>
  </Navbar>
        </>
    );
    
}

export default Navigation;