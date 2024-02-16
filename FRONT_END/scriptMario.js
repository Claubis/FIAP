// Seleciona o elemento HTML com classe 'mario' e 'pipe'//
const mario = document.querySelector('.mario');
const pipe = document.querySelector('.pipe');
 
// Define uam função chamada 'jump'
const jump = () => { //criando uma função anonima (Para deixar o código mais leve)
    //Adiciona a classe 'jump' ao elemento mario
    mario.classList.add('jump');
    // Configura um temporizador para remover a classe 'jump' após 0.5 segundos
    setTimeout(() => {
        mario.classList.remove('jump');
    }, 500);
}
 
//Configura um intervalo de repetição que executa a cada 10 milissegundos
const loop = setInterval(() => {
    // obtem a posição horizontal (left) do elemento pipe
    const pipePosition = pipe.offsetLeft;
    // obtem a posição vertical (bottom) do elemento mario
    const marioPosition = window.getComputedStyle(mario).bottom.replace('px','');//pegando a posição em px e tranformando em nada para cpmseguir fazer comparação
 
    // Verifica se o mario colidiu com o pipe
    if (pipePosition <= 120 && pipePosition > 0 && marioPosition < 80) {
        //Remove a animação e define a posição do pipe para a posição atual
        pipe.style.animation = 'none';
        pipe.style.left = `${pipePosition}px`;
 
        // Remove a animação e define a posição do mario para a posição atual
        mario.style.animation = 'none';
        mario.style.bottom = `${marioPosition}px`;
 
        //Altera a imagem do mario para uma imagem de "game-over"
        mario.src = './assets/game-over.png';
        mario.style.width = '75px';
        mario.style.marginLeft = '50px';
 
        // Limpa o intervalo de repetição. interrompendo o loop do jogo
        clearInterval(loop);
 
        //Atividade para alunos pesquisarem e implementarem sozinhos.
        // Aguarda 0.5 segundos antes de recarregar a página
        setTimeout(() => {
            location.reload();
        }, 500)
    }
}, 10);
 
//Adiciona um ouvinte de evento ao documento que chama a função 'jump' quando uma tecla é pressionada
document.addEventListener('keydown', jump);