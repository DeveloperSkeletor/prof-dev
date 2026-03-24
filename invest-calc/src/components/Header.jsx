import logo from "../assets/Investment-Calculator-logo.png";
export default function Header() {
  return (
    <header id="header">
      <img src={logo} alt="money bag" />
      <h1>Investment Calculator</h1>
    </header>
  );
}
