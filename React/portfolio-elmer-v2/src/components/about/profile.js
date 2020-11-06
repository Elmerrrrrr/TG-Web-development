import Card from 'react-bootstrap/Card'
import './_about.scss'
import profilePicure from '../../assets/img/portfolio/elmer-profielfoto.jpg'
import { FaLinkedin } from 'react-icons/fa';
import { BsArrowsMove } from 'react-icons/bs';


function Profile(){
   
    return(

        <Card >
            <Card.Body>
            
                <Card.Img variant="top" src={profilePicure}/>
                <Card.Title>Elmer Volgers</Card.Title>
                <Card.Subtitle className="mb-2 text-muted">Webdeveloper</Card.Subtitle>
                <Card.Text>
                   Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempora fugiat officiis suscipit non ea at, cupiditate quas architecto.
                </Card.Text>
                <Card.Link href="https://www.linkedin.com/in/elmer-volgers-67729614a/" target="_blank"><FaLinkedin /></Card.Link>
            </Card.Body>
            <p  className ='arrow-move'><BsArrowsMove/></p>
        </Card>       
   
   );
}

export default Profile;