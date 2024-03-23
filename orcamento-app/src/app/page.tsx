import TestPage from '../pages/testPage/index';
import Link from 'next/link';

export default function Home() {
  return (
    <main>
      <div>
        <TestPage>Test2</TestPage>
      </div>
      <div>
        <Link href="/anotherPage">Another Page</Link>
      </div>
    </main>
  );
}
