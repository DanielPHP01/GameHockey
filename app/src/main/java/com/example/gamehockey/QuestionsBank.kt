package com.example.gamehockey

class QuestionsBank {
    val getQuestions: List<QuestionsList>
        get() {
            val questionsLists: MutableList<QuestionsList> = ArrayList<QuestionsList>()
            val question1 = QuestionsList(
                R.drawable.img,
                "What is the name of the highest professional hockey league in North America?",
                "NHL", "AHL", "ECHL", "KHL",
                "NHL", ""
            )
            val question2 = QuestionsList(
                R.drawable.img_1,
                "What is the name of the trophy awarded to the NHL playoff champion?",
                "Stanley Cup", "Vezina Trophy", "Art Ross Trophy", "Hart Memorial Trophy",
                "Stanley Cup", ""
            )
            val question3 = QuestionsList(
                R.drawable.img_2,
                "How many players are on the ice for each team during a regular game of hockey?",
                "5", "6", "7", "8",
                "6", ""
            )
            val question4 = QuestionsList(
                R.drawable.img_3,
                "Who holds the NHL record for the most career goals?",
                "Wayne Gretzky", "Gordie Howe", "Brett Hull", "Jaromir Jagr",
                "Wayne Gretzky", ""
            )
            val question5 = QuestionsList(
                R.drawable.img_4,
                "What is the term for when a player scores three goals in a single game?",
                "Triple Crown", "Hat trick", "Grand Slam", "Slam dunk",
                "Hat trick", ""
            )
            val question6 = QuestionsList(
                R.drawable.img_5,
                "What is the name of the defensive position in hockey responsible for guarding their team's net?",
                "Center", "Wing", "Defenseman", "Goalie",
                "Defenseman", ""
            )
            val question7 = QuestionsList(
                R.drawable.img_6,
                "What is the term for when a player uses their stick to prevent an opponent from making a play on the puck?",
                "Interference", "Hooking", "Slashing", "Checking",
                "Hooking", ""
            )
            val question8 = QuestionsList(
                R.drawable.img_7,
                "What is the name of the penalty where a player is removed from the game for five minutes and their team plays short-handed?",
                "Minor penalty", "Major penalty", "Misconduct penalty", "Game misconduct penalty",
                "Major penalty", ""
            )
            val question9 = QuestionsList(
                R.drawable.img_8,
                "Which country has won the most gold medals in men's ice hockey at the Winter Olympics?",
                "Canada", "Russia/Soviet Union", "United States", "Sweden",
                "Russia/Soviet Union", ""
            )
            val question10 = QuestionsList(
                R.drawable.img_9,
                "What is the term for when a team is playing with fewer players on the ice due to a penalty?",
                "Power play", "Penalty kill", "Overtime", "Shootout",
                "Penalty kill", ""
            )
            questionsLists.add(question1)
            questionsLists.add(question2)
            questionsLists.add(question3)
            questionsLists.add(question4)
            questionsLists.add(question5)
            questionsLists.add(question6)
            questionsLists.add(question7)
            questionsLists.add(question8)
            questionsLists.add(question9)
            questionsLists.add(question10)
            return questionsLists
        }
}


