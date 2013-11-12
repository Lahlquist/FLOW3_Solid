
package flow3_solid;

//Herunder ses den Java-klasse vi har importeret fra Java's bibliotek:
import javax.swing.JOptionPane;

/**
 * Flow 3 - "Solid"
 * Udarbejdet af:
 * Søren og Laura
 * Onsdag 06.11.2013 #Part 1
 * Tirsdag 19.11.2013 #Part 2
 */

//Denne JFrame-form indeholder ”det synlige program”, samtidig med,
//at den kalder metoderne fra ”Control”-klassen, der skal få programmets funktioner til at virke.
public class GUI extends javax.swing.JFrame
{   
    //Herunder ses denne JFrames attributter.
    WordPairControlIF control;
    
    //Creates new form GUI
    public GUI(WordPairControlIF control)
    {
        initComponents();
        this.control = control;
        
        //Hvis "load" returnerer "true", vil følgende tekst dukke op i programmet.
        if(control.load())
        {
            jLabel1_Feedback.setText("THE FILE IS SUCCESFULLY LOADED! :)");
        }
        //(...) hvis det returnerer "false", vil følgende tekst dukke op i programmet.
        else
        {
            jLabel1_Feedback.setText("THE FILE COULD NOT BE LOADED! :(");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jOptionPane1_Warning = new javax.swing.JOptionPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1_NewPairOfWords = new javax.swing.JPanel();
        jLabel1_PairOfWords = new javax.swing.JLabel();
        jLabel1_EnglishWord = new javax.swing.JLabel();
        jLabel1_DanishWord = new javax.swing.JLabel();
        jTextField1_EnglishWord = new javax.swing.JTextField();
        jTextField1_DanishWord = new javax.swing.JTextField();
        jButton1_Save = new javax.swing.JButton();
        jLabel1_Feedback = new javax.swing.JLabel();
        jButton1_Delete = new javax.swing.JButton();
        jButton2_ClearAll = new javax.swing.JButton();
        jButton3_Quantity = new javax.swing.JButton();
        jPanel2_RandomTask = new javax.swing.JPanel();
        jLabel1_Question = new javax.swing.JLabel();
        jLabel2_Answer = new javax.swing.JLabel();
        jTextField1_Question = new javax.swing.JTextField();
        jTextField1_Answer = new javax.swing.JTextField();
        jButton1_GiveMeARandomTask = new javax.swing.JButton();
        jButton1_Guess = new javax.swing.JButton();
        jLabel1_RandomTask = new javax.swing.JLabel();
        jLabel1_CorrectOrIncorrectGuess = new javax.swing.JLabel();
        jPanel3_LookUpWords = new javax.swing.JPanel();
        jLabel1_LookUpWords = new javax.swing.JLabel();
        jLabel2_TheWordIRemember = new javax.swing.JLabel();
        jTextField1_TheWordIRemember = new javax.swing.JTextField();
        jButton1_LookUp = new javax.swing.JButton();
        jLabel1_TheOtherWord = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1_PairOfWords.setFont(new java.awt.Font("Eurostile", 1, 24)); // NOI18N
        jLabel1_PairOfWords.setText("PAIR OF WORDS");

        jLabel1_EnglishWord.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1_EnglishWord.setText("English Word");

        jLabel1_DanishWord.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1_DanishWord.setText("Danish Word");

        jButton1_Save.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jButton1_Save.setText("SAVE");
        jButton1_Save.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1_SaveActionPerformed(evt);
            }
        });

        jLabel1_Feedback.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1_Delete.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jButton1_Delete.setText("DELETE");
        jButton1_Delete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1_DeleteActionPerformed(evt);
            }
        });

        jButton2_ClearAll.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jButton2_ClearAll.setText("CLEAR ALL");
        jButton2_ClearAll.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2_ClearAllActionPerformed(evt);
            }
        });

        jButton3_Quantity.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jButton3_Quantity.setText("QUANTITY");
        jButton3_Quantity.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3_QuantityActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1_NewPairOfWordsLayout = new org.jdesktop.layout.GroupLayout(jPanel1_NewPairOfWords);
        jPanel1_NewPairOfWords.setLayout(jPanel1_NewPairOfWordsLayout);
        jPanel1_NewPairOfWordsLayout.setHorizontalGroup(
            jPanel1_NewPairOfWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1_NewPairOfWordsLayout.createSequentialGroup()
                .add(jPanel1_NewPairOfWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1_NewPairOfWordsLayout.createSequentialGroup()
                        .add(76, 76, 76)
                        .add(jPanel1_NewPairOfWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1_NewPairOfWordsLayout.createSequentialGroup()
                                .add(jPanel1_NewPairOfWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel1_EnglishWord)
                                    .add(jLabel1_DanishWord))
                                .add(47, 47, 47)
                                .add(jPanel1_NewPairOfWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jTextField1_DanishWord, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 277, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextField1_EnglishWord, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 277, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1_Feedback, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 436, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1_NewPairOfWordsLayout.createSequentialGroup()
                        .add(201, 201, 201)
                        .add(jLabel1_PairOfWords)))
                .addContainerGap(69, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1_NewPairOfWordsLayout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jPanel1_NewPairOfWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButton1_Save, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 158, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton1_Delete, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 158, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(71, 71, 71)
                .add(jPanel1_NewPairOfWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jButton2_ClearAll, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton3_Quantity, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(94, 94, 94))
        );
        jPanel1_NewPairOfWordsLayout.setVerticalGroup(
            jPanel1_NewPairOfWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1_NewPairOfWordsLayout.createSequentialGroup()
                .add(27, 27, 27)
                .add(jLabel1_PairOfWords)
                .add(28, 28, 28)
                .add(jPanel1_NewPairOfWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1_EnglishWord)
                    .add(jTextField1_EnglishWord, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1_NewPairOfWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField1_DanishWord, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1_DanishWord))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 48, Short.MAX_VALUE)
                .add(jLabel1_Feedback, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(27, 27, 27)
                .add(jPanel1_NewPairOfWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButton1_Save)
                    .add(jButton3_Quantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1_NewPairOfWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1_Delete, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton2_ClearAll, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(53, 53, 53))
        );

        jTabbedPane1.addTab("PAIR OF WORDS", jPanel1_NewPairOfWords);

        jLabel1_Question.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1_Question.setText("Question");

        jLabel2_Answer.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2_Answer.setText("Answer");

        jTextField1_Answer.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField1_AnswerActionPerformed(evt);
            }
        });

        jButton1_GiveMeARandomTask.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jButton1_GiveMeARandomTask.setText("GIVE ME A RANDOM TASK");
        jButton1_GiveMeARandomTask.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1_GiveMeARandomTaskActionPerformed(evt);
            }
        });

        jButton1_Guess.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jButton1_Guess.setText("GUESS");
        jButton1_Guess.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1_GuessActionPerformed(evt);
            }
        });

        jLabel1_RandomTask.setFont(new java.awt.Font("Eurostile", 1, 24)); // NOI18N
        jLabel1_RandomTask.setText("RANDOM TASK");

        jLabel1_CorrectOrIncorrectGuess.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        org.jdesktop.layout.GroupLayout jPanel2_RandomTaskLayout = new org.jdesktop.layout.GroupLayout(jPanel2_RandomTask);
        jPanel2_RandomTask.setLayout(jPanel2_RandomTaskLayout);
        jPanel2_RandomTaskLayout.setHorizontalGroup(
            jPanel2_RandomTaskLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2_RandomTaskLayout.createSequentialGroup()
                .add(jPanel2_RandomTaskLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2_RandomTaskLayout.createSequentialGroup()
                        .add(99, 99, 99)
                        .add(jPanel2_RandomTaskLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2_Answer)
                            .add(jLabel1_Question))
                        .add(30, 30, 30))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2_RandomTaskLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(jButton1_Guess)
                        .add(18, 18, 18)))
                .add(jPanel2_RandomTaskLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jLabel1_CorrectOrIncorrectGuess, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .add(jTextField1_Answer, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .add(jTextField1_Question))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2_RandomTaskLayout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .add(jPanel2_RandomTaskLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2_RandomTaskLayout.createSequentialGroup()
                        .add(jButton1_GiveMeARandomTask)
                        .add(119, 119, 119))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2_RandomTaskLayout.createSequentialGroup()
                        .add(jLabel1_RandomTask)
                        .add(205, 205, 205))))
        );
        jPanel2_RandomTaskLayout.setVerticalGroup(
            jPanel2_RandomTaskLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2_RandomTaskLayout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel1_RandomTask)
                .add(27, 27, 27)
                .add(jButton1_GiveMeARandomTask)
                .add(33, 33, 33)
                .add(jPanel2_RandomTaskLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField1_Question, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1_Question))
                .add(25, 25, 25)
                .add(jPanel2_RandomTaskLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2_Answer)
                    .add(jTextField1_Answer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(62, 62, 62)
                .add(jPanel2_RandomTaskLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1_Guess)
                    .add(jLabel1_CorrectOrIncorrectGuess, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("RANDOM TASK", jPanel2_RandomTask);

        jLabel1_LookUpWords.setFont(new java.awt.Font("Eurostile", 1, 24)); // NOI18N
        jLabel1_LookUpWords.setText("LOOK UP WORDS");

        jLabel2_TheWordIRemember.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2_TheWordIRemember.setText("The word I remember");

        jTextField1_TheWordIRemember.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField1_TheWordIRememberActionPerformed(evt);
            }
        });

        jButton1_LookUp.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jButton1_LookUp.setText("LOOK UP");
        jButton1_LookUp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1_LookUpActionPerformed(evt);
            }
        });

        jLabel1_TheOtherWord.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        org.jdesktop.layout.GroupLayout jPanel3_LookUpWordsLayout = new org.jdesktop.layout.GroupLayout(jPanel3_LookUpWords);
        jPanel3_LookUpWords.setLayout(jPanel3_LookUpWordsLayout);
        jPanel3_LookUpWordsLayout.setHorizontalGroup(
            jPanel3_LookUpWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3_LookUpWordsLayout.createSequentialGroup()
                .add(jPanel3_LookUpWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3_LookUpWordsLayout.createSequentialGroup()
                        .add(jPanel3_LookUpWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel3_LookUpWordsLayout.createSequentialGroup()
                                .add(63, 63, 63)
                                .add(jButton1_LookUp)
                                .add(42, 42, 42))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3_LookUpWordsLayout.createSequentialGroup()
                                .addContainerGap()
                                .add(jLabel2_TheWordIRemember, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 196, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)))
                        .add(jPanel3_LookUpWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel1_TheOtherWord, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jTextField1_TheWordIRemember, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)))
                    .add(jPanel3_LookUpWordsLayout.createSequentialGroup()
                        .add(193, 193, 193)
                        .add(jLabel1_LookUpWords)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel3_LookUpWordsLayout.setVerticalGroup(
            jPanel3_LookUpWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3_LookUpWordsLayout.createSequentialGroup()
                .add(28, 28, 28)
                .add(jLabel1_LookUpWords)
                .add(52, 52, 52)
                .add(jPanel3_LookUpWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField1_TheWordIRemember, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2_TheWordIRemember))
                .add(81, 81, 81)
                .add(jPanel3_LookUpWordsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1_LookUp)
                    .add(jLabel1_TheOtherWord, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LOOK UP WORDS", jPanel3_LookUpWords);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_AnswerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField1_AnswerActionPerformed
    {//GEN-HEADEREND:event_jTextField1_AnswerActionPerformed
        //Dette er blot et tekstfelt, der figurerer i vores GUI.
    }//GEN-LAST:event_jTextField1_AnswerActionPerformed

    private void jButton1_SaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1_SaveActionPerformed
    {//GEN-HEADEREND:event_jButton1_SaveActionPerformed
        //Når der trykkes på "Save", bliver de to ord først og fremmest hentet af programmet.
        String englishWord = jTextField1_EnglishWord.getText();
        String danishWord = jTextField1_DanishWord.getText();
        
        //Her kaldes "add"-metoden fra "Control"-klassen, der kopierer det engelske og det danske ord ind i ArrayListen.
        control.add(englishWord, danishWord);
        
        //Her kaldes metoden "save" fra "Control"-klassen, der gemmer i en tekstfil.
        control.save();
        
        jLabel1_Feedback.setText(englishWord + " and " + danishWord + " is saved as a wordpair.");
        
        //Herunder sættes de to felter, hvor de nye ord blev skrevet, til at blive blanke, når der trykkes på "Save".
        jTextField1_EnglishWord.setText("");
        jTextField1_DanishWord.setText("");
    }//GEN-LAST:event_jButton1_SaveActionPerformed

    private void jButton1_GiveMeARandomTaskActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1_GiveMeARandomTaskActionPerformed
    {//GEN-HEADEREND:event_jButton1_GiveMeARandomTaskActionPerformed
        //Når der trykkes på "Give Me A Random Task"-knappen:
        //Metoden "getRandomQuestion" fra "Control"-klassen, kopieres ind i variablen "a".
        String a = control.getRandomQuestion();
        
        //Herefter sættes den tekst, som "getRandomQuestion"-metoden finder, "a", ind i følgende tekstfelt.
        jTextField1_Question.setText(a);
    }//GEN-LAST:event_jButton1_GiveMeARandomTaskActionPerformed

    private void jTextField1_TheWordIRememberActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField1_TheWordIRememberActionPerformed
    {//GEN-HEADEREND:event_jTextField1_TheWordIRememberActionPerformed
        //Dette er blot et tekstfelt, der figurerer i vores GUI.
    }//GEN-LAST:event_jTextField1_TheWordIRememberActionPerformed

    private void jButton1_LookUpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1_LookUpActionPerformed
    {//GEN-HEADEREND:event_jButton1_LookUpActionPerformed
        //Denne "getText"-metode, henter teksten fra følgende tekstfelt, når der trykkes på "Look Up"-knappen.
        String theWordIRemember = jTextField1_TheWordIRemember.getText();
        
        jLabel1_TheOtherWord.setText(control.lookup(theWordIRemember) + " is the corresponding word to " + theWordIRemember + ".");
        
        jTextField1_TheWordIRemember.setText("");
    }//GEN-LAST:event_jButton1_LookUpActionPerformed

    private void jButton1_GuessActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1_GuessActionPerformed
    {//GEN-HEADEREND:event_jButton1_GuessActionPerformed
        String question = jTextField1_Question.getText();
        String guess = jTextField1_Answer.getText();
        
        //Herunder ses en "if/else"-erklæring.
        //Hvis "checkGuess"-metoden, fra "Control"-klassen, er "true", så gives der besked om dette i følgende jLabel.
        if(control.checkGuess(question, guess))
        {
            jLabel1_CorrectOrIncorrectGuess.setText("Right! " + question + " and " + guess + " is a wordpair.");
        }
        //Ellers, hvis denne er "false", gives der besked om dette i samme jLabel.
        else
        {
            jLabel1_CorrectOrIncorrectGuess.setText("Wrong! " + question + " and " + guess + " is NOT a wordpair.");
        }
        
        //Denne "setText"-metode, clearer de to felter, når der trykkes på "Guess"-knappen.
        jTextField1_Question.setText("");
        jTextField1_Answer.setText("");
    }//GEN-LAST:event_jButton1_GuessActionPerformed

    private void jButton3_QuantityActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3_QuantityActionPerformed
    {//GEN-HEADEREND:event_jButton3_QuantityActionPerformed
        //Når der trykkes på "Quantity"-knappen, returneres størrelsen på ArrayListen.
        jLabel1_Feedback.setText("The quantity of wordpairs is " + control.size());
    }//GEN-LAST:event_jButton3_QuantityActionPerformed

    private void jButton1_DeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1_DeleteActionPerformed
    {//GEN-HEADEREND:event_jButton1_DeleteActionPerformed
        String word1 = jTextField1_EnglishWord.getText();
        String word2 = jTextField1_DanishWord.getText();
        
        control.delete(word1);
        control.delete(word2);
        control.save();
        
        jLabel1_Feedback.setText("The wordpair is deleted from the collection.");
        
        jTextField1_DanishWord.setText("");
        jTextField1_EnglishWord.setText("");
    }//GEN-LAST:event_jButton1_DeleteActionPerformed

    private void jButton2_ClearAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2_ClearAllActionPerformed
    {//GEN-HEADEREND:event_jButton2_ClearAllActionPerformed
        //Når der trykkes på "Clear All"-knappen, kommer der et "JOptionPane" op med en advarsel.
        int i = JOptionPane.showConfirmDialog(null, "DO YOU REALLY WANT TO CLEAR THE WHOLE COLLECTION?");
        
        //Hvis der trykkes på "Yes"-knappen, slettes hele ArrayListen og tekstfilen.
        if(i == JOptionPane.YES_OPTION)
        {
            control.clear();
        }
    }//GEN-LAST:event_jButton2_ClearAllActionPerformed

//    //Herunder ses main-metoden i vores JFrame "GUI":
//    public static void main(String args[])
//    {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try
//        {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
//            {
//                if ("Nimbus".equals(info.getName()))
//                {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex)
//        {
//            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex)
//        {
//            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex)
//        {
//            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex)
//        {
//            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable()
//        {
//            //Herunder kaldes metoden "run", der sætter GUI til at være synlig og funktionel:
//            public void run()
//            {
//                new GUI().setVisible(true);
//            }
//        });
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Delete;
    private javax.swing.JButton jButton1_GiveMeARandomTask;
    private javax.swing.JButton jButton1_Guess;
    private javax.swing.JButton jButton1_LookUp;
    private javax.swing.JButton jButton1_Save;
    private javax.swing.JButton jButton2_ClearAll;
    private javax.swing.JButton jButton3_Quantity;
    private javax.swing.JLabel jLabel1_CorrectOrIncorrectGuess;
    private javax.swing.JLabel jLabel1_DanishWord;
    private javax.swing.JLabel jLabel1_EnglishWord;
    private javax.swing.JLabel jLabel1_Feedback;
    private javax.swing.JLabel jLabel1_LookUpWords;
    private javax.swing.JLabel jLabel1_PairOfWords;
    private javax.swing.JLabel jLabel1_Question;
    private javax.swing.JLabel jLabel1_RandomTask;
    private javax.swing.JLabel jLabel1_TheOtherWord;
    private javax.swing.JLabel jLabel2_Answer;
    private javax.swing.JLabel jLabel2_TheWordIRemember;
    private javax.swing.JOptionPane jOptionPane1_Warning;
    private javax.swing.JPanel jPanel1_NewPairOfWords;
    private javax.swing.JPanel jPanel2_RandomTask;
    private javax.swing.JPanel jPanel3_LookUpWords;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1_Answer;
    private javax.swing.JTextField jTextField1_DanishWord;
    private javax.swing.JTextField jTextField1_EnglishWord;
    private javax.swing.JTextField jTextField1_Question;
    private javax.swing.JTextField jTextField1_TheWordIRemember;
    // End of variables declaration//GEN-END:variables
}
