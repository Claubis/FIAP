import './Componentes/App.css'

function App() {

  let formatar = {
    fontSize: '40px',
    color: 'green'
  }

  return (
    <>
    <h1> Hello Would </h1>

    <h2 className='primeiraClasse'> Teste para mudar de cor </h2>

    <h3 style={{ textAlign:'center', fontSize:'48'}}> Estilo inline </h3>

    <h4 style={formatar}> Deixar o Css incorporado </h4>

    

    </>
  )
}

export default App
