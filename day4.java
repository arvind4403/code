// day4
/*

C:\Users\krarv\OneDrive\Desktop\code>cd https://github.com/arvind4403/code.git
The filename, directory name, or volume label syntax is incorrect.

C:\Users\krarv\OneDrive\Desktop\code>git status
On branch chnages01
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        code/

nothing added to commit but untracked files present (use "git add" to track)

C:\Users\krarv\OneDrive\Desktop\code>git add .
warning: adding embedded git repository: code
hint: You've added another git repository inside your current repository.
hint: Clones of the outer repository will not contain the contents of
hint: the embedded repository and will not know how to obtain it.
hint: If you meant to add a submodule, use:
hint:
hint:   git submodule add <url> code
hint:
hint: If you added this path by mistake, you can remove it from the
hint: index with:
hint:
hint:   git rm --cached code
hint:
hint: See "git help submodule" for more information.

C:\Users\krarv\OneDrive\Desktop\code>git commit -m "cloning the same repo"
[chnages01 75d8ff9] cloning the same repo
 1 file changed, 1 insertion(+)
 create mode 160000 code

C:\Users\krarv\OneDrive\Desktop\code>git push origin
fatal: The current branch chnages01 has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin chnages01

To have this happen automatically for branches without a tracking
upstream, see 'push.autoSetupRemote' in 'git help config'.


C:\Users\krarv\OneDrive\Desktop\code>git push origin main
To https://github.com/arvind4403/code.git
 ! [rejected]        main -> main (fetch first)
error: failed to push some refs to 'https://github.com/arvind4403/code.git'
hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

C:\Users\krarv\OneDrive\Desktop\code>git fetch
remote: Enumerating objects: 7, done.
remote: Counting objects: 100% (7/7), done.
remote: Compressing objects: 100% (5/5), done.
remote: Total 6 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (6/6), 2.20 KiB | 118.00 KiB/s, done.
From https://github.com/arvind4403/code
   49744b1..0605e09  main       -> origin/main

C:\Users\krarv\OneDrive\Desktop\code>git pull origin
You asked to pull from the remote 'origin', but did not specify
a branch. Because this is not the default configured remote
for your current branch, you must specify a branch on the command line.

C:\Users\krarv\OneDrive\Desktop\code>git branch
* chnages01
  main

C:\Users\krarv\OneDrive\Desktop\code>git add .

C:\Users\krarv\OneDrive\Desktop\code>git status
On branch chnages01
nothing to commit, working tree clean

C:\Users\krarv\OneDrive\Desktop\code>git branch
* chnages01
  main

C:\Users\krarv\OneDrive\Desktop\code>git pull origin chnages01
fatal: couldn't find remote ref chnages01

C:\Users\krarv\OneDrive\Desktop\code>
*/
