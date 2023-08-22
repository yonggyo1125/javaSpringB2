window.addEventListener("DOMContentLoaded", function() {
    const swiper = new Swiper(".mySwiper", {
        loop: true,
        navigation: {
            nextEl: ".mySwiper .next",
            prevEl: ".mySwiper .prev",
        },
        pagination: {
          el: ".swiper-pagination",
        },
    });

    /* 더보기 메뉴 클릭시 */
    const moreMenus = document.getElementsByClassName("more_menu");
    const slideMenu = document.querySelector(".slide_menu");
    const layerDim = document.querySelector(".layer_dim");
    const closeBtn = document.querySelector(".slide_menu .close");

    for (const el of moreMenus) {
        el.addEventListener("click", function() {
            
        });
    }

    /* 닫기 버튼 클릭시 */
    closeBtn.addEventListener("click", function() {

    });

});