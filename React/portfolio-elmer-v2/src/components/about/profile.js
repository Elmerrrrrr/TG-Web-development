import Card from 'react-bootstrap/Card'
import './_about.scss'
import profilePicure from '../../assets/img/portfolio/elmer-profielfoto.jpg'



function Profile(){
   
    return(

        <Card >
            <Card.Body>
                <Card.Img variant="top" src={profilePicure}/>
                <Card.Title>Elmer Volgers</Card.Title>
                <Card.Subtitle className="mb-2 text-muted">Webdeveloper</Card.Subtitle>
                <Card.Text>
                   Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempora fugiat officiis suscipit non ea at, cupiditate quas architecto velit assumenda iste facere hic dolore distinctio repellat provident illum dignissimos aspernatur!
                </Card.Text>
                <Card.Link href="#linkedin">linkedIn icon</Card.Link>
            </Card.Body>
        </Card>       
   
   );
}

export default Profile;