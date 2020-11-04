// import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button'

import * as React from "react";
// import { useState } from "react";
import { useRef } from "react";
import { motion } from "framer-motion"


function Contact(){
    const constraintsRef = useRef(null);
    // const [count, setCount] = useState(0);

    return(




 
 <motion.div className="contactContainer" id='contact' ref={constraintsRef}>
        
    <motion.div drag dragConstraints={constraintsRef} >

    <Form>
    <h3>Let's get in touch!</h3>
    <br/>

    <Form.Group as={Row} controlId="formName">
    <Form.Label column sm={2}>
        Name
        </Form.Label>
        <Col sm={10}>
        <Form.Control type="text" placeholder="Name" />
        </Col>
    </Form.Group>

    <Form.Group as={Row} controlId="formEmail">
        <Form.Label column sm={2}>
        Email
        </Form.Label>
        <Col sm={10}>
        <Form.Control type="email" placeholder="Email" />
        </Col>
    </Form.Group>

    <Form.Group as={Row} controlId="formMessage">
        <Form.Label column sm={2}>
       Message
        </Form.Label>
        <Col sm={10}>
        <Form.Control type="textarea" placeholder="Message" />
        </Col>
    </Form.Group>

    <Form.Group as={Row}>
        <Col sm={{ span: 10, offset: 2 }}>
        <Button type="submit">Send Message</Button>
        </Col>
    </Form.Group>
   </Form>


  </motion.div>  

</motion.div>
 
    );
}

export default Contact;