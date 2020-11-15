import './_Portfolio.scss';
import Navigation from './components/navigation/navigation';
import Banner from './components/banner/banner';
import About from './components/about/about';
import Parallax from './components/parallax/parallax'
import ContactForm from './components/contact/contact';
import ScrollUpBtn from './components/scroll-up-btn/scroll.jsx';

import ContactFormNew from './components/contact/contactform';





function Portfolio() {

  
  return (
    <>
      <header>
      <Navigation />
      <Banner />
      <ScrollUpBtn />
      </header>
      <About />
      <Parallax />
      <ContactForm />

      <ContactFormNew />
      
    </>
  );
}

export default Portfolio;
