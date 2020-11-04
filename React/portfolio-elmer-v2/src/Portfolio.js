import './_Portfolio.scss';
import Navigation from './components/navigation/navigation';
import Banner from './components/banner/banner';
import About from './components/about/about';
import ContactForm from './components/contact/contact';
import Footer from './components/footer/footer';
import Parallax from './components/parallax/parallax'


function Portfolio() {

  
  return (
    <>

      <Navigation />
      <Banner />
      <About />
      <Parallax />
      <ContactForm />
      <Footer />
    </>
  );
}

export default Portfolio;
