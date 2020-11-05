// import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button'
import { BsArrowsMove } from 'react-icons/bs';

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
    <p  className ='arrow-move-contact'><BsArrowsMove/></p>
   </Form>

   
  </motion.div>  
{/* 
  <div>
<form id="contact-form" onSubmit={this.handleSubmit.bind(this)} method="POST">
<div className="form-group">
    <label htmlFor="name">Name</label>
    <input type="text" className="form-control" />
</div>
<div className="form-group">
    <label htmlFor="exampleInputEmail1">Email address</label>
    <input type="email" className="form-control" aria-describedby="emailHelp" />
</div>
<div className="form-group">
    <label htmlFor="message">Message</label>
    <textarea className="form-control" rows="5"></textarea>
</div>
<button type="submit" className="btn btn-primary">Submit</button>
</form>
 </div> */}

</motion.div>


    );
}

export default Contact;