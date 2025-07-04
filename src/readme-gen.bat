@echo off
setlocal enabledelayedexpansion

echo # 📘 Project Structure in All Branches > README.md
echo. >> README.md

for /f "delims=" %%b in ('git for-each-ref --format="%%(refname:short)" refs/heads/') do (
    echo 🔄 Checking out branch %%b...
    git checkout %%b >nul 2>&1

    echo ## 🌿 Branch: %%b >> README.md
    echo ``` >> README.md

    REM Use tree to get directory structure (up to 2 levels)
    tree /F /A > temp_tree.txt
    type temp_tree.txt >> README.md
    del temp_tree.txt

    echo ``` >> README.md
    echo. >> README.md
)

REM Switch back to main
git checkout main >nul
echo ✅ README.md has been updated and returned to 'main' branch.
