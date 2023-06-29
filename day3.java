// day3

/*
Microsoft Windows [Version 10.0.22621.1848]
(c) Microsoft Corporation. All rights reserved.

C:\Users\krarv>cd C:\Users\krarv\OneDrive\Desktop\code

C:\Users\krarv\OneDrive\Desktop\code>git init
Initialized empty Git repository in C:/Users/krarv/OneDrive/Desktop/code/.git/

C:\Users\krarv\OneDrive\Desktop\code>git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        kahani.txt.txt
        rahul/

nothing added to commit but untracked files present (use "git add" to track)

C:\Users\krarv\OneDrive\Desktop\code>git add .

C:\Users\krarv\OneDrive\Desktop\code>git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   kahani.txt.txt
        new file:   rahul/mera.txt.txt


C:\Users\krarv\OneDrive\Desktop\code>git add README.md
fatal: pathspec 'README.md' did not match any files

C:\Users\krarv\OneDrive\Desktop\code>git commit -m "no changes"
[master (root-commit) 49744b1] no changes
 2 files changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 kahani.txt.txt
 create mode 100644 rahul/mera.txt.txt

C:\Users\krarv\OneDrive\Desktop\code>git branch -
fatal: '-' is not a valid branch name

C:\Users\krarv\OneDrive\Desktop\code>git branch -M main

C:\Users\krarv\OneDrive\Desktop\code>git remote add origin https://github.com/arvind4403/code.git

C:\Users\krarv\OneDrive\Desktop\code>git push -u origin main
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 12 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (4/4), 293 bytes | 293.00 KiB/s, done.
Total 4 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/arvind4403/code.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.

C:\Users\krarv\OneDrive\Desktop\code>git branch chnages01

C:\Users\krarv\OneDrive\Desktop\code>git checkout changes01
error: pathspec 'changes01' did not match any file(s) known to git

C:\Users\krarv\OneDrive\Desktop\code>git checkout chnages01
Switched to branch 'chnages01'

C:\Users\krarv\OneDrive\Desktop\code>git add musics
fatal: pathspec 'musics' did not match any files

C:\Users\krarv\OneDrive\Desktop\code>git add rahul

C:\Users\krarv\OneDrive\Desktop\code>git status
On branch chnages01
nothing to commit, working tree clean

C:\Users\krarv\OneDrive\Desktop\code>git add rahul

C:\Users\krarv\OneDrive\Desktop\code>git commit -m "some changes in file"
On branch chnages01
nothing to commit, working tree clean

C:\Users\krarv\OneDrive\Desktop\code>git status
On branch chnages01
nothing to commit, working tree clean

C:\Users\krarv\OneDrive\Desktop\code>git add .

C:\Users\krarv\OneDrive\Desktop\code>git status
On branch chnages01
nothing to commit, working tree clean

C:\Users\krarv\OneDrive\Desktop\code>git add rahul

C:\Users\krarv\OneDrive\Desktop\code>git commit
On branch chnages01
nothing to commit, working tree clean

C:\Users\krarv\OneDrive\Desktop\code>git merge
fatal: No remote for the current branch.

C:\Users\krarv\OneDrive\Desktop\code>git add rahul

C:\Users\krarv\OneDrive\Desktop\code>git status
On branch chnages01
nothing to commit, working tree clean

C:\Users\krarv\OneDrive\Desktop\code>git init
Reinitialized existing Git repository in C:/Users/krarv/OneDrive/Desktop/code/.git/

C:\Users\krarv\OneDrive\Desktop\code>git status
On branch chnages01
nothing to commit, working tree clean

C:\Users\krarv\OneDrive\Desktop\code>git commit -m
error: switch `m' requires a value

C:\Users\krarv\OneDrive\Desktop\code>git commit -m "first changes"
On branch chnages01
nothing to commit, working tree clean

C:\Users\krarv\OneDrive\Desktop\code>git merge
fatal: No remote for the current branch.

C:\Users\krarv\OneDrive\Desktop\code>git commit
On branch chnages01
nothing to commit, working tree clean

C:\Users\krarv\OneDrive\Desktop\code>
 */
