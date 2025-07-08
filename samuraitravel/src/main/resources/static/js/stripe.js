const stripe = Stripe('pk_test_51RWYWAQbHWgfbt7kQ9IyyehcHsZVTYxfN7WSUhZSpYuhQxGXpCJJTTccgOf4YzW236HmDBGiZVA9Ry2wYgx8ECIQ00IRmLl1pf');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
 stripe.redirectToCheckout({
   sessionId: sessionId
 })
});