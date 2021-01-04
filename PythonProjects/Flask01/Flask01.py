from flask import Flask, render_template, request

app = Flask(__name__)


@app.route('/', methods=['GET', 'POST'])
def home():
    if request.method == 'GET':
        return render_template('index.html')
    else:
        username = request.form['username']
        password = request.form['password']
        if username == 'A' and password == '1':
            return render_template('index.html', message='Login successful')
        else:
            error_message = 'Hint: He curses a lot'
            return render_template('index.html', message=error_message)


@app.route('/about', methods=['GET'])
def about():
    return render_template('about.html')


app.run(port=7000, debug=True)
