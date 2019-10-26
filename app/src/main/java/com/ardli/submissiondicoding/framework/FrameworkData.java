package com.ardli.submissiondicoding.framework;

import com.ardli.submissiondicoding.R;

import java.util.ArrayList;

public class FrameworkData {
    private static String[] namaFramework = {
            "Node js",
            "Laravel",
            "Codeigniter",
            "React",
            "Spring Boot",
            "Angular",
            "Vuejs",
            "CakePHP",
            "Django",
            "Ruby on Rails",
            "Express"
    };

    private static String[] detailFramework = {
            "Node.js is an open-source, cross-platform, JavaScript runtime environment that executes JavaScript code outside of a browser.",
            "laravel is a free, open-source PHP web framework, created by Taylor Otwell and intended for the development of web applications following the model–view–controller architectural pattern and based on Symfony.",
            "CodeIgniter is an open-source software rapid development web framework, for use in building dynamic web sites with PHP.",
            "react is a JavaScript library for building user interfaces. It is maintained by Facebook and a community of individual developers and companies. react can be used as a base in the development of single-page or mobile applications, as it is optimal for fetching rapidly changing data that needs to be recorded.",
            "The Spring Framework is an application framework and inversion of control container for the Java platform. The framework's core features can be used by any Java application, but there are extensions for building web applications on top of the Java EE platform.",
            "Angular is a TypeScript-based open-source web application framework led by the Angular Team at Google and by a community of individuals and corporations. Angular is a complete rewrite from the same team that built AngularJS.",
            "Vue.js is an open-source Model–view–viewmodel JavaScript framework for building user interfaces and single-page applications. It was created by Evan You, and is maintained by him and the rest of the active core team members coming from various companies such as Netlify and Netguru.",
            "CakePHP is an open-source web framework. It follows the model–view–controller approach and is written in PHP, modeled after the concepts of Ruby on Rails, and distributed under the MIT License.",
            "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design. Built by experienced developers, it takes care of much of the hassle of Web development, so you can focus on writing your app without needing to reinvent the wheel. It’s free and open source.",
            "Learning to build a modern web application is daunting. Ruby on Rails makes it much easier and more fun. It includes everything you need to build fantastic applications, and you can learn it with the support of our large, friendly community.",
            "Express is a minimal and flexible Node.js web application framework that provides a robust set of features for web and mobile applications."
    };

    private static int[] imgFramework = {
            R.drawable.nodejs,
            R.drawable.laravel,
            R.drawable.ci,
            R.drawable.react,
            R.drawable.spring,
            R.drawable.angular,
            R.drawable.vue,
            R.drawable.cake,
            R.drawable.django,
            R.drawable.ror,
            R.drawable.express
    };

    private static String[] situsFramework = {
            "http://nodejs.org",
            "http://laravel.com",
            "http://codeigniter.com",
            "http://reactjs.org",
            "http://spring.io",
            "http://angular.io",
            "http://vuejs.org",
            "http://cakephp.org",
            "http://djangoproject.com",
            "http://rubyonrails.org",
            "http://expressjs.com"
    };

    private static String[] bahasaFramework = {
            "Javascript",
            "PHP",
            "PHP",
            "Javascript",
            "Java",
            "Typescript",
            "Javascript",
            "PHP",
            "Python",
            "Ruby",
            "Javascript"
    };

    private static String[] jenisFramework = {
            "Backend",
            "Backend",
            "Backend",
            "Frontend",
            "Backend",
            "Frontend",
            "Frontend",
            "Backend",
            "Backend",
            "Backend",
            "Backend"
    };

    private static String[] versiFramework = {
            "13.0.1",
            "6.4",
            "3.1.11",
            "16.10.2",
            "5.2.0",
            "8.2.12",
            "2.6.10",
            "3.8.5",
            "2.2.6",
            "6.0.0",
            "4.17.1"
    };

    public static ArrayList<Framework> getListData() {
        ArrayList<Framework> listFramework = new ArrayList<>();
        for (int i = 0; i < namaFramework.length; i++) {
            Framework framework = new Framework();
            framework.setImage(imgFramework[i]);
            framework.setDetail(detailFramework[i]);
            framework.setBahasa(bahasaFramework[i]);
            framework.setJenis(jenisFramework[i]);
            framework.setNama(namaFramework[i]);
            framework.setVersi(versiFramework[i]);
            framework.setSitus(situsFramework[i]);

            listFramework.add(framework);
        }
        return listFramework;
    }
}
