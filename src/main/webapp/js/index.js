$(document).ready(function(){

    // Single page nav
    $('.tm-main-nav').singlePageNav({
        'currentClass' : "active",
        offset : 20
    });

    // Magnific pop up
    $('.tm-gallery-1').magnificPopup({
      delegate: 'a', // child items selector, by clicking on it popup will open
      type: 'image',
      gallery: {enabled:true}
      // other options
    }); 

    $('.tm-gallery-2').magnificPopup({
      delegate: 'a', // child items selector, by clicking on it popup will open
      type: 'image',
      gallery: {enabled:true}
      // other options
    }); 

    $('.tm-gallery-3').magnificPopup({
      delegate: 'a', // child items selector, by clicking on it popup will open
      type: 'image',
      gallery: {enabled:true}
      // other options
    }); 

    $('.tm-current-year').text(new Date().getFullYear());                
});
