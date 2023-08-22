window.addEventListener("DOMContentLoaded", function() {
    const swiper = new Swiper(".mySwiper", {
        loop: true,
        navigation: {
            nextEl: ".swiper-button-next",
            prevEl: ".swiper-button-prev",
        },
        pagination: {
          el: ".swiper-pagination",
        },
    });
});