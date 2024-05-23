package util;

import io.quarkus.runtime.LaunchMode;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.transaction.Transactional;
import model.BlogEntry;

@ApplicationScoped
public class Startup {
    /**
     * This method is executed at the start of your application
     */
    @Transactional
    public void start(@Observes StartupEvent evt) {
        // in DEV mode we seed some data
        if (LaunchMode.current() == LaunchMode.DEVELOPMENT) {
            BlogEntry blogEntry = new BlogEntry("How to make cheese",
                    "The process is easy, here's how to set it up in 12 steps. The last one will surprise you.");
            blogEntry.persist();

            blogEntry = new BlogEntry("How to eat cheese",
                    "The process is easy, here's how to set it up in 12 steps. The last one will surprise you.");
            blogEntry.persist();

            blogEntry = new BlogEntry("Getting Started with Quarkus", "\n"
                    + "Quarkus is a revolutionary framework designed to optimize Java for Kubernetes and cloud-native environments. Combining a fast startup time, low memory footprint, and a developer-friendly approach, Quarkus is rapidly gaining popularity. In this post, we will explore what makes Quarkus stand out and how to get started with it.\n"
                    + "\n"
                    + "## What is Quarkus?\n"
                    + "\n"
                    + "Quarkus is a Kubernetes-native Java framework tailored for GraalVM and HotSpot. It focuses on making Java a leading platform in Kubernetes environments by offering:\n"
                    + "\n"
                    + "- **Supersonic Subatomic Java**: Quarkus boasts fast startup times and low memory usage, which are critical for cloud-native applications.\n"
                    + "- **Developer Joy**: Features like live coding and unified configuration aim to enhance the developer experience.\n"
                    + "- **Reactive and Imperative**: Quarkus supports both reactive and imperative programming models, giving developers flexibility in their approach.\n"
                    + "\n"
                    + "## Key Features\n"
                    + "\n"
                    + "### 1. Fast Startup and Low Memory Footprint\n"
                    + "\n"
                    + "Quarkus applications start up quickly and consume minimal memory, making them ideal for containerized environments. This efficiency is achieved through techniques like ahead-of-time (AOT) compilation with GraalVM.\n"
                    + "\n"
                    + "### 2. Live Coding\n"
                    + "\n"
                    + "Quarkus live coding feature allows developers to see code changes in real-time without restarting the application. This significantly speeds up the development process and reduces downtime.\n"
                    + "\n"
                    + "### 3. Unified Configuration\n"
                    + "\n"
                    + "Quarkus simplifies configuration management by providing a single configuration file for all environments. This consistency helps avoid configuration drift and ensures smoother deployments.\n"
                    + "\n"
                    + "### 4. Extensible Framework\n"
                    + "\n"
                    + "Quarkus offers a wide range of extensions for various technologies, including Hibernate, RESTEasy, and Kafka. These extensions integrate seamlessly with Quarkus, allowing developers to build complex applications with ease.\n"
                    + "\n"
                    + "## Getting Started\n"
                    + "\n"
                    + "To get started with Quarkus, follow these simple steps:\n"
                    + "\n"
                    + "### Step 1: Install Quarkus CLI\n"
                    + "\n"
                    + "First, install the Quarkus command-line interface (CLI):\n"
                    + "\n"
                    + "```bash\n"
                    + "curl -Ls https://sh.quarkus.io/install.sh | bash\n"
                    + "```\n"
                    + "\n"
                    + "### Step 2: Create a New Project\n"
                    + "\n"
                    + "Use the Quarkus CLI to create a new project:\n"
                    + "\n"
                    + "```bash\n"
                    + "quarkus create app org.acme:my-first-quarkus-app\n"
                    + "```\n"
                    + "\n"
                    + "### Step 3: Run the Application\n"
                    + "\n"
                    + "Navigate to the project directory and run the application in development mode:\n"
                    + "\n"
                    + "```bash\n"
                    + "cd my-first-quarkus-app\n"
                    + "./mvnw compile quarkus:dev\n"
                    + "```\n"
                    + "\n"
                    + "Your Quarkus application is now running, and you can start coding!\n"
                    + "\n"
                    + "\n"
                    + "## Conclusion\n"
                    + "\n"
                    + "Quarkus is an exciting framework that brings Java into the cloud-native era with impressive performance and developer-friendly features. Whether you are building microservices or serverless applications, Quarkus offers a robust and efficient platform to help you achieve your goals. Give Quarkus a try and experience the future of Java development!\n"
                    + "\n"
                    + "By exploring Quarkus, you will join a growing community of developers who are redefining what Java can do in the cloud. Happy coding!");
            blogEntry.persist();

            blogEntry = new BlogEntry("Web Components with Lit", "\n"
                    + "![Lit Logo](https://logowik.com/content/uploads/images/lit1871.logowik.com.webp#google_vignette)\n"
                    + "\n"
                    + "## Introduction\n"
                    + "\n"
                    + "In the ever-evolving world of web development, staying ahead of the curve is essential. One library that has been making waves in the realm of Web Components is **Lit**. Designed to simplify the creation of fast, lightweight, and reusable web components, Lit has quickly become a favorite among developers. In this blog post, we will explore what makes Lit stand out, how it works, and why you should consider it for your next project.\n"
                    + "\n"
                    + "## What is Lit?\n"
                    + "\n"
                    + "Lit is a modern, efficient, and highly flexible library for building Web Components. It builds on the standard Web Components APIs, making it easier to create and manage custom elements. Lit`s core philosophy revolves around leveraging the web platform`s native capabilities, providing just enough abstraction to make development smoother and more intuitive.\n"
                    + "\n"
                    + "## Key Features\n"
                    + "\n"
                    + "### Lightweight and Fast\n"
                    + "\n"
                    + "Lit is designed to be lightweight, ensuring that your components are performant and quick to load. The library itself has a small footprint, which means it will not bloat your application or slow down your website.\n"
                    + "\n"
                    + "### Declarative Templates\n"
                    + "\n"
                    + "Lit uses a declarative templating system that allows you to write HTML directly within your JavaScript or TypeScript files. This makes it easy to visualize the structure of your components and manage dynamic content.\n"
                    + "\n"
                    + "```javascript\n"
                    + "import { html, css, LitElement } from \"lit\";\n"
                    + "\n"
                    + "class MyElement extends LitElement {\n"
                    + "  static styles = css`\n"
                    + "    :host {\n"
                    + "      display: block;\n"
                    + "      padding: 16px;\n"
                    + "      color: var(--my-element-text-color, black);\n"
                    + "    }\n"
                    + "  `;\n"
                    + "\n"
                    + "  static properties = {\n"
                    + "    name: { type: String }\n"
                    + "  };\n"
                    + "\n"
                    + "  constructor() {\n"
                    + "    super();\n"
                    + "    this.name = \"World\";\n"
                    + "  }\n"
                    + "\n"
                    + "  render() {\n"
                    + "    return html`<p>Hello, ${this.name}!</p>`;\n"
                    + "  }\n"
                    + "}\n"
                    + "\n"
                    + "customElements.define(\"my-element\", MyElement);\n"
                    + "```\n"
                    + "\n"
                    + "### Reactive Properties\n"
                    + "\n"
                    + "Lit introduces a reactive properties system that simplifies state management within components. By defining properties and their corresponding types, Lit ensures that your components update efficiently when data changes.\n"
                    + "\n"
                    + "### Extensible and Composable\n"
                    + "\n"
                    + "Lit is designed to be highly extensible. You can easily create base classes and mixins to share functionality across multiple components. This composability allows for greater code reuse and cleaner architecture.\n"
                    + "\n"
                    + "### Community and Ecosystem\n"
                    + "\n"
                    + "The Lit community is vibrant and growing, with a wealth of resources, tutorials, and plugins available. Whether you are just getting started or looking to dive deep into advanced features, there is plenty of support to help you along the way.\n"
                    + "\n"
                    + "## Getting Started with Lit\n"
                    + "\n"
                    + "To get started with Lit, you will need to install the library via npm:\n"
                    + "\n"
                    + "```bash\n"
                    + "npm install lit\n"
                    + "```\n"
                    + "\n"
                    + "Once installed, you can start creating your first Lit component by extending the `LitElement` class and defining your templates and styles.\n"
                    + "\n"
                    + "### Example: Creating a Simple Counter\n"
                    + "\n"
                    + "Here is a simple example of a counter component built with Lit:\n"
                    + "\n"
                    + "```javascript\n"
                    + "import { html, css, LitElement } from \"lit\";\n"
                    + "\n"
                    + "class CounterElement extends LitElement {\n"
                    + "  static styles = css`\n"
                    + "    :host {\n"
                    + "      display: block;\n"
                    + "      padding: 16px;\n"
                    + "    }\n"
                    + "    button {\n"
                    + "      font-size: 1.2em;\n"
                    + "    }\n"
                    + "  `;\n"
                    + "\n"
                    + "  static properties = {\n"
                    + "    count: { type: Number }\n"
                    + "  };\n"
                    + "\n"
                    + "  constructor() {\n"
                    + "    super();\n"
                    + "    this.count = 0;\n"
                    + "  }\n"
                    + "\n"
                    + "  increment() {\n"
                    + "    this.count += 1;\n"
                    + "  }\n"
                    + "\n"
                    + "  render() {\n"
                    + "    return html`\n"
                    + "      <div>Count: ${this.count}</div>\n"
                    + "      <button @click=\"${this.increment}\">Increment</button>\n"
                    + "    `;\n"
                    + "  }\n"
                    + "}\n"
                    + "\n"
                    + "customElements.define(\"counter-element\", CounterElement);\n"
                    + "```\n"
                    + "\n"
                    + "## Why Choose Lit?\n"
                    + "\n"
                    + "### Simplicity and Elegance\n"
                    + "\n"
                    + "Lit provides a clean and simple API that leverages modern JavaScript features, making it easy to learn and use. Its declarative approach to templates and reactive properties simplifies component development.\n"
                    + "\n"
                    + "### Performance\n"
                    + "\n"
                    + "With its minimal overhead and efficient rendering system, Lit ensures that your components are fast and responsive, providing a smooth user experience.\n"
                    + "\n"
                    + "### Compatibility\n"
                    + "\n"
                    + "Lit builds on the standard Web Components APIs, ensuring compatibility with other frameworks and libraries. This makes it easy to integrate Lit components into existing projects.\n"
                    + "\n"
                    + "## Conclusion\n"
                    + "\n"
                    + "Lit is a powerful tool for modern web development, offering a perfect blend of simplicity, performance, and flexibility. \n"
                    + "Whether you are building a small widget or a complex application, Lit provides the tools you need to create high-quality, reusable web components. \n"
                    + "Give Lit a try and see how it can revolutionize your development workflow.");
            blogEntry.persist();

            blogEntry = new BlogEntry("Exploring HTMX", "\n"
                    + "### Introduction\n"
                    + "In the ever-evolving landscape of web development, HTMX has emerged as a powerful tool for creating dynamic and interactive web applications. By extending HTML with modern AJAX capabilities, HTMX simplifies the process of building sophisticated web interfaces without the need for extensive JavaScript. In this blog post, we will explore what HTMX is, its core features, and how it can revolutionize your web development workflow.\n"
                    + "\n"
                    + "### What is HTMX?\n"
                    + "HTMX is a JavaScript library that allows you to use extended HTML attributes to perform AJAX requests, WebSockets, and Server-Sent Events (SSE) directly from HTML. It was created to enhance the capabilities of HTML and enable developers to build modern web applications with less JavaScript code.\n"
                    + "\n"
                    + "### Core Features of HTMX\n"
                    + "1. **Seamless AJAX Integration**: With HTMX, you can perform AJAX requests using HTML attributes such as `hx-get`, `hx-post`, and `hx-swap`. This allows you to update parts of your web page dynamically without a full page reload.\n"
                    + "2. **WebSocket Support**: HTMX supports WebSockets, enabling real-time communication between the client and server. This is particularly useful for applications that require live updates, such as chat applications or real-time dashboards.\n"
                    + "3. **Server-Sent Events (SSE)**: HTMX also supports SSE, allowing the server to push updates to the client. This is ideal for applications that need to provide live data feeds.\n"
                    + "4. **Declarative Approach**: HTMX promotes a declarative approach to web development. By using HTML attributes, you can describe the desired behavior directly in your HTML, making your code more readable and maintainable.\n"
                    + "\n"
                    + "### Getting Started with HTMX\n"
                    + "To get started with HTMX, you need to include the HTMX library in your project. You can do this by adding the following script tag to your HTML file:\n"
                    + "\n"
                    + "```html\n"
                    + "<script src=\"https://unpkg.com/htmx.org\"></script>\n"
                    + "```\n"
                    + "\n"
                    + "Once you have included the library, you can start using HTMX attributes in your HTML. Here’s a simple example:\n"
                    + "\n"
                    + "```html\n"
                    + "<!DOCTYPE html>\n"
                    + "<html lang=\"en\">\n"
                    + "<head>\n"
                    + "    <meta charset=\"UTF-8\">\n"
                    + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "    <title>HTMX Example</title>\n"
                    + "</head>\n"
                    + "<body>\n"
                    + "    <button hx-get=\"/hello\" hx-target=\"#response\">Say Hello</button>\n"
                    + "    <div id=\"response\"></div>\n"
                    + "\n"
                    + "    <!-- HTMX Script -->\n"
                    + "    <script src=\"https://unpkg.com/htmx.org\"></script>\n"
                    + "</body>\n"
                    + "</html>\n"
                    + "```\n"
                    + "\n"
                    + "In this example, clicking the \"Say Hello\" button will send a GET request to the `/hello` endpoint and update the content of the `#response` div with the response from the server.\n"
                    + "\n"
                    + "### Benefits of Using HTMX\n"
                    + "1. **Reduced JavaScript Code**: By leveraging HTML attributes, you can reduce the amount of JavaScript code needed to achieve dynamic functionality.\n"
                    + "2. **Enhanced Readability**: HTMX promotes a clean and declarative approach, making your code easier to read and understand.\n"
                    + "3. **Improved Performance**: HTMX allows you to update specific parts of your page without a full page reload, leading to faster and more efficient web applications.\n"
                    + "\n"
                    + "### Conclusion\n"
                    + "HTMX is a powerful tool that extends the capabilities of HTML and simplifies the process of building dynamic web applications. By using HTMX, you can create interactive and real-time web experiences with minimal JavaScript code. Whether you are building a simple website or a complex web application, HTMX is a valuable addition to your web development toolkit.");
            blogEntry.persist();
        }
    }
}