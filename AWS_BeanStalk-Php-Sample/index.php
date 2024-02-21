<?
if ($_SERVER['REQUEST_METHOD'] === 'POST')
{
  $file = '/tmp/sample-app.log';
  $message = file_get_contents('php://input');
  file_put_contents($file, date('Y-m-d H:i:s') . " Received message: " . $message . "\n", FILE_APPEND);
}
else
{
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Links to Repositories/Projects with AWS Elastic Beanstalk and Jenkins</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-image: url('https://wallpapers.com/images/hd/minimalist-gray-f8tfvmsugbfylndq.jpg');
            background-size: cover;
            padding: 20px;
            margin: 0;
        }
        h1 {
            text-align: center;
            color: #fff;
        }
        .container {
            background-color: rgba(255, 255, 255, 0.5);
            border-radius: 5px;
            padding: 15px;
            margin: 20px;
        }
        .links {
            list-style-type: none;
            padding: 0;
            margin: 0;
        }
        .links li {
            margin-bottom: 5px;
        }
        .links li a {
            display: block;
            padding: 8px;
            background-color: rgba(255, 255, 255, 0.5); 
            color: #000; 
            text-decoration: none;
            border-radius: 3px;
            transition: background-color 0.3s;
        }
        .links li a:hover {
            background-color: rgba(255, 255, 255, 0.8); 
        }
        .image-container {
            text-align: center; 
        }
        img {
            max-width: 100%;
            height: auto;
            opacity: 0.8; 
            border-radius: 5px; 
        }

        
        @media only screen and (max-width: 600px) {
            .container {
                margin: 10px; 
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Links to Repositories/Projects with AWS Elastic Beanstalk and Jenkins</h1>
        <ul class="links">
            <li><a href="https://github.com/MatveyGuralskiy/Flask-FirstSite">🚀 Flask-FirstSite</a></li>
            <li><a href="https://github.com/MatveyGuralskiy/Ansible">🔧 Ansible</a></li>
            <li><a href="https://github.com/MatveyGuralskiy/Leet-Code">⚡ Leet-Code Solutions</a></li>
            <li><a href="https://github.com/MatveyGuralskiy/Bash-scripts">🐧 Bash Scripts</a></li>
            <li><a href="https://github.com/MatveyGuralskiy/Python-scripts">🐍 Python Scripts</a></li>
            <li><a href="https://github.com/MatveyGuralskiy/Networking">🌐 Networking Essentials for DevOps Engineers</a></li>
            <li><a href="https://github.com/MatveyGuralskiy/Jenkins">✏️ Jenkins </a></li>
        </ul>
    </div>
    <div class="image-container">
        <img src="https://media1.giphy.com/media/v1.Y2lkPTc5MGI3NjExMmk1ZXIwaWlrcnJtcG02Z2oxYXQ3MmdodnU2ZW80aTdkYWJjbWkxOCZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/du3J3cXyzhj75IOgvA/giphy.gif" alt="GitHub Gif">
    </div>
    <!--[if lt IE 9]><script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script><![endif]-->
</body>
</html>
<? 
} 
?>