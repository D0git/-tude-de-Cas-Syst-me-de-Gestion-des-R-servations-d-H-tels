"use client";
import { Button } from "@mui/material";
import Image from "next/image";
import Link from "next/link";

export default function Home() {
  return (
    <div className="grid grid-rows-[20px_1fr_20px] items-center justify-items-center min-h-screen p-8 pb-20 gap-16 sm:p-20 font-[family-name:var(--font-geist-sans)]">
      <main className="flex flex-col gap-8 row-start-2 items-center sm:items-start">
        <Image
          className="dark:invert"
          src="/next.svg"
          alt="Next.js logo"
          width={180}
          height={38}
          priority
        />
        <h1 className="text-4xl font-bold text-center sm:text-left">
          Welcome !
        </h1>
        <p className="text-lg text-center sm:text-left">
        Please choose one of these backend technologies
        </p>
        <ol className="list-inside list-decimal text-sm text-left sm:text-left font-[family-name:var(--font-geist-mono)]">
          <li>
            SOAP
            
          </li>
          <li>REST API </li>
          <li>Graphql</li>
          <li>GRPC</li>
        </ol>
        <div className="flex gap-4">
        <Link href="/soap" passHref>
          <Button variant="contained" color="secondary">
              SOAP
          </Button>
        </Link>
        <Link href="/restapi" passHref>
          <Button variant="contained" color="secondary">
              REST API
          </Button>
        </Link>
        <Link href="/graphql" passHref>
          <Button variant="contained" color="secondary">
              GRAPHQL
          </Button>
        </Link>
        <Link href="/grpc" passHref>
          <Button variant="contained" color="secondary">
              GRPC
          </Button>
        </Link>
        </div>
      </main>
      
    </div>
  );
}
